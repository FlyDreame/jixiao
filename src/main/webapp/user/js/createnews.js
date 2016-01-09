/**
 * Created by me on 2016/1/8.
 */

$(document).ready(function () {
    $('#summernote').summernote({

        height: 300, // set editor height
        toolbar: [
            //[groupname, [button list]]
            ['style', ['bold', 'italic', 'underline', 'clear']],
            ['font', ['strikethrough']],
            ['fontsize', ['fontsize']],
            ['color', ['color']],
            ['para', ['ul', 'ol', 'paragraph']],
            ['height', ['height']],
        ]
    });
});

$('#news-submit').click(function () {
    var newtitle = $('#news-title').val();
    var newcontent = $('.note-editable').html();
    var data = {
        title: newtitle,
        content: newcontent
    }
    $.ajax({
        url: '/user/add_news.do',
        type: 'POST',
        data: data,
        dataType: 'json',
        success: function (data) {
            alert(data.remsg);
        }
    });
});