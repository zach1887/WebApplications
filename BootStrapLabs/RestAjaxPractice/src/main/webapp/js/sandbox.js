$(document).ready(function (event) {

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

