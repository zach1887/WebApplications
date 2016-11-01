$(document).ready(function (event) {

// Step 1: Find the damn button
    var btn = $("#getAllLlamas");
    // Step 2:  register a click callback
    btn.click(function (event) {
//        alert("Hi... we found the button!!!");
        //Step3 Start AJAX request
        $.ajax({
            url: "allLlamas",
            type: "GET",
            headers: {
                Accept: "application/json"
            }
            // re
        }).success(function (llamaList) {
            var llamaHerdDiv = $("#llamaHerd");

            // iterate over this list
            $.each(llamaList, function (index, llama) {
//                alert(llama.name);
                llamaHerdDiv.text(llama.name + "," + llamaHerdDiv.text());
            });

        });
    });

});

