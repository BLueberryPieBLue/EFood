$(document).ready(function() {
    $(".c1").css("zIndex", "1").css("display", "block");
    $(".b1").css("background-color", "brown");
    $(".b1>p").css("color", "white");
    $(".b1").mouseover(function() {
        $(".c1").css("zIndex", "0").css("display", "none");
        $(".c2").css("zIndex", "0").css("display", "none");
        $(".c3").css("zIndex", "0").css("display", "none");

        $(".b1").css("background-color", "rgb(207, 200, 200)");
        $(".b2").css("background-color", "rgb(207, 200, 200)");
        $(".b3").css("background-color", "rgb(207, 200, 200)");
        $(".b1>p").css("color", "black");
        $(".b2>p").css("color", "black");
        $(".b3>p").css("color", "black");

        $(".c1").css("zIndex", "1").css("display", "block");
        $(".b1").css("background-color", "brown");
        $(".b1>p").css("color", "white");
        $(".sl").css("height", "680px");

    });
    $(".b2").mouseover(function() {
        $(".c1").css("zIndex", "0").css("display", "none");
        $(".c2").css("zIndex", "0").css("display", "none");
        $(".c3").css("zIndex", "0").css("display", "none");

        $(".b1").css("background-color", "rgb(207, 200, 200)");
        $(".b2").css("background-color", "rgb(207, 200, 200)");
        $(".b3").css("background-color", "rgb(207, 200, 200)");
        $(".b1>p").css("color", "black");
        $(".b2>p").css("color", "black");
        $(".b3>p").css("color", "black");

        $(".c2").css("zIndex", "1").css("display", "block");
        $(".b2").css("background-color", "brown");
        $(".b2>p").css("color", "white");
        $(".sl").css("height", "1000px");

    });
    $(".b3").mouseover(function() {
        $(".c1").css("zIndex", "0").css("display", "none");
        $(".c2").css("zIndex", "0").css("display", "none");
        $(".c3").css("zIndex", "0").css("display", "none");

        $(".b1").css("background-color", "rgb(207, 200, 200)");
        $(".b2").css("background-color", "rgb(207, 200, 200)");
        $(".b3").css("background-color", "rgb(207, 200, 200)");
        $(".b1>p").css("color", "black");
        $(".b2>p").css("color", "black");
        $(".b3>p").css("color", "black");

        $(".c3").css("zIndex", "1").css("display", "block");
        $(".b3").css("background-color", "brown");
        $(".b3>p").css("color", "white");
        $(".sl").css("height", "1925px");

    });
});