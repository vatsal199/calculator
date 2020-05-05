$(document).ready(function(){
    // Get value on button click and show alert
    var op = undefined;
    $("#eval").click(function(){
        var val1 = parseInt( $("#input1").val() );
        var val2 = parseInt( $("#input2").val() );
        //alert(op);

        var res;
        if(op == "sum"){
            res = val1 + val2;
        }else if(op == "sub"){
            res = val1 - val2;
        }else if(op == "mul"){
            res = val1 * val2;
        }else if(op == "div"){
            res = val1 / val2;
        }else{
            res = "Please select operation";
        }

        $("#result").text(res);
    });

    $("#sum").click(function () {
        op = "sum";
    })

    $("#sub").click(function () {
        op = "sub";
    })

    $("#mul").click(function () {
        op = "mul";
    })

    $("#div").click(function () {
        op = "div";
    })
});