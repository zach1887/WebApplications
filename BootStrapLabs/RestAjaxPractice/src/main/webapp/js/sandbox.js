// This registers a callback to be exected with the DOM is finished loading.
$(document).ready(function (event) {

    //Registering a callaback to be executed when a button called
    // makeLlama is clicked
    // jQuery searches via CSS selectors an element with the id of makeLlama
    $('#makeLlama').click(function (event) {  
        var llamaNameToUse = $('#llamaName').val();
//       alert(llamaNameToUse);
        $.ajax({
            url: 'makeLlama/' + llamaNameToUse,
            type: 'POST',
            headers: {
                Accept: 'application/json'
            }
        }).success(function(llama){
            // use .html() to change the internal html of an element
            // when it is not an input field.
            $('#llama').html(llama.name);
        });
    });

//    $.ajax({
//        url: 'test',
//        type: 'GET',
//        headers: {
//            'Accept': 'application/json'
//        }
//    }).success(function (llama) {
//        alert(llama.name);
//    });
//    $.ajax({
//        url: 'makeLlama/George',
//        type: 'POST',
//        headers: {
//            'Accept': 'application/json'
//        }
//    }).success(function (llama) {
//        alert(llama.name);
//    });

});

