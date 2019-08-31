$(document).ready(function() {

    $(".do").css("width", $(window).width()).css("height", $(window).height());
    $(".dos").css("width", $(window).width()).css("height", $(window).height());
    // new hScroll({
    //     nav1: '.info li', //导航对应的元素
    //     nav2: '.do>div', //监听的元素
    //     checkClass: 'headv-check' //选中的样式
    // });
    $(".do1").css("z-index", "2");
    $(".d1").css("color", "red");
    da = [".d1", ".d2", ".d3", ".d4", ".d5"];
    db = [".do1", ".do2", ".do3", ".do4", ".do5"];

    function d1(i) {
        $("li").css("color", "black");
        $(da[i]).css("color", "red");
        $(".dos").css("z-index", "1");
        $(db[i]).css("z-index", "2");
    };

    $(".d1").mouseover(function() {
        $("li").css("color", "black");
        $(this).css("color", "red");
        $(".dos").css("z-index", "1");
        $(".do1").css("z-index", "2");
    });
    $(".d2").mouseover(function() {
        $("li").css("color", "black");
        $(this).css("color", "red");
        $(".dos").css("z-index", "1");
        $(".do2").css("z-index", "2");
    });
    $(".d3").mouseover(function() {
        $("li").css("color", "black");
        $(this).css("color", "red");
        $(".dos").css("z-index", "1");
        $(".do3").css("z-index", "2");
    });
    $(".d4").mouseover(function() {
        $("li").css("color", "black");
        $(this).css("color", "red");
        $(".dos").css("z-index", "1");
        $(".do4").css("z-index", "2");
    });
    $(".d5").mouseover(function() {
        $("li").css("color", "black");
        $(this).css("color", "red");
        $(".dos").css("z-index", "1");
        $(".do5").css("z-index", "2");
    });
    b = 0;
    $('body').mousewheel(function(event, delta) {
        var dir = delta > 0 ? 'Up' : 'Down';
        // console.log('delta' + delta);
        if (dir == 'Up') {
            console.log('向上滚动');
            b++;
            d1(Math.abs(b % 5));
            console.log(Math.abs(b % 5));
        } else {
            console.log('向下滚动');
            b--;
            d1(Math.abs(b % 5));
            console.log(Math.abs(b % 5));
        }
        return false;

    });

});