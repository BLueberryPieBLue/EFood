$(document).ready(function() {
    var width = $(window).width();
    // var height = $(window).height();

    // 切换的图片的数组
    var arrImages = [
        "images/b1.png", "images/b2.png", "images/b3.png", "images/b4.png"
    ];
    var num = 0;
    $("#wraper").css("backgroundImage", "url(" + arrImages[num] + ")")

    // 设置 wraper的宽高
    $("#wraper").css("width", width).css("height", "730px");

    setInterval(change, 5000);

    function change() {
        num >= arrImages.length - 1 ? num = 0 : num++;
        $("#wraper").css("backgroundImage", "url(" + arrImages[num] + ")")

    }

    $("form :input.required").each(function() {
        var $required = $("<strong class='high'>*</strong>");
        $(this).parent().append($required);
    });
    $("form :input").blur(function() {
        var $parent = $(this).parent();
        if ($(this).is("#email")) {
            var emailVal = $.trim(this.value);
            var regEmail = /.+@.+\.[a-zA-Z]{2,4}$/;
            if (emailVal == "" || (emailVal != "" && !regEmail.test(emailVal))) {
                $parent.find(".emailError").remove();
                $parent.find(".emailSuccess").remove();
                $parent.append("<b><span class='msg onError emailError'>请输入正确的E-Mail住址！</span></b>");
            } else {
                $parent.find(".high").remove();
                $parent.find(".emailError").remove();
                $parent.find(".emailSuccess").remove();
                $parent.append("<b><span class='msg onSuccess emailSuccess'>通过</span></b>");
            }
        }
        if ($(this).is("#qq")) {
            var qqVal = $.trim(this.value);
            var regqq = /\d{5,}$/;
            if (qqVal == "" || (qqVal != "" && !regqq.test(qqVal))) {
                $parent.find(".qqError").remove();
                $parent.find(".qqSuccess").remove();
                $parent.append("<b><span class='msg onError qqError'>请输入正确的QQ！</span></b>");
            } else {
                $parent.find(".high").remove();
                $parent.find(".qqError").remove();
                $parent.find(".qqSuccess").remove();
                $parent.append("<b><span class='msg onSuccess qqSuccess'>通过</span></b>");
            }
        }
        if ($(this).is("#box")) {
            var boxVal = $.trim(this.value);
            var regbox = /.+$/;
            if (boxVal == "" || (boxVal != "" && !regbox.test(boxVal))) {
                $parent.find(".boxError").remove();
                $parent.find(".boxSuccess").remove();
                $parent.append("<b><span class='msg onError boxError'>此项不能为空！</span></b>");
            } else {
                $parent.find(".high").remove();
                $parent.find(".boxError").remove();
                $parent.find(".boxSuccess").remove();
                $parent.append("<b><span class='msg onSuccess boxSuccess'>通过</span></b>");
            }
        }
    });
    $("#submit").click(function() {
        var $parent = $("form :input").parent();
        if (($parent.find(".onSuccess")).length != 3) {
            console.log($parent.find(".onSuccess").length);
            alert("请按照正确格式填写表单!");
            return false;
        } else {
            console.log(0);
        }
    });
});