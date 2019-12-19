$(document).ready(function() {

    $(".do").css("width", $(window).width());
    $(".dos").css("width", $(window).width());

    (function() {
        function hScroll() {
            self = this;
            self.nav1 = '.info li'; //导航栏
            self.nav2 = '.do>div'; //需要监听的内容
            self.checkClass = 'headv-check'; //选中样式
            self.init();
        }
        hScroll.prototype = {
            init: function() {
                var self = this,
                    arr = [],
                    kdiv = $(self.nav2);
                for (var i = 0; i < kdiv.length; i++) {
                    arr.push($(kdiv[i]).offset().top);
                }
                self.sctopFun(arr);
                $(window).scroll(function(e) {
                    self.sctopFun(arr);
                });
                $(self.nav1).mouseover(function(e) {
                    $('body,html').animate({
                        scrollTop: arr[$(this).index()] + 'px'
                    });
                });
            },
            sctopFun: function(arr) {
                var self = this;
                var scrollTop = document.documentElement.scrollTop || window.pageYOffset || document.body.scrollTop;
                var keys = 0,
                    flag = true;
                for (var i = 0; i < arr.length; i++) {
                    keys++;
                    if (flag) {
                        if (scrollTop >= arr[arr.length - keys] - 300) {
                            $(self.nav1).eq(arr.length - keys).addClass(self.checkClass).siblings().removeClass(self.checkClass);
                            flag = false;
                        } else {
                            flag = true;
                        }
                    }
                }
            },
        }
        window.hScroll = hScroll;
    }());
    new hScroll();
    // $(".do1").css("z-index", "2");
    // $(".d1").css("color", "red");
    // da = [".d1", ".d2", ".d3", ".d4", ".d5"];
    // db = [".do1", ".do2", ".do3", ".do4", ".do5"];

    // function d1(i) {
    //     $("li").css("color", "black");
    //     $(da[i]).css("color", "red");
    //     $(".dos").css("z-index", "1");
    //     $(db[i]).css("z-index", "2");
    // };
    // $(".d1").mouseover(function() {
    //     $("li").css("color", "black");
    //     $(this).css("color", "red");
    //     $(".dos").css("z-index", "1");
    //     $(".do1").css("z-index", "2");
    // });
    // $(".d2").mouseover(function() {
    //     $("li").css("color", "black");
    //     $(this).css("color", "red");
    //     $(".dos").css("z-index", "1");
    //     $(".do2").css("z-index", "2");
    // });
    // $(".d3").mouseover(function() {
    //     $("li").css("color", "black");
    //     $(this).css("color", "red");
    //     $(".dos").css("z-index", "1");
    //     $(".do3").css("z-index", "2");
    // });
    // $(".d4").mouseover(function() {
    //     $("li").css("color", "black");
    //     $(this).css("color", "red");
    //     $(".dos").css("z-index", "1");
    //     $(".do4").css("z-index", "2");
    // });
    // $(".d5").mouseover(function() {
    //     $("li").css("color", "black");
    //     $(this).css("color", "red");
    //     $(".dos").css("z-index", "1");
    //     $(".do5").css("z-index", "2");
    // });
    // b = 0;
    // $('body').mousewheel(function(event, delta) {
    //     var dir = delta > 0 ? 'Up' : 'Down';
    //     if (dir == 'Up') {
    //         console.log('向上滚动');
    //         b++;
    //         d1(Math.abs(b % 5));
    //         console.log(Math.abs(b % 5));
    //     } else {
    //         console.log('向下滚动');
    //         b--;
    //         d1(Math.abs(b % 5));
    //         console.log(Math.abs(b % 5));
    //     }
    //     return false;

    // });

});