/**
 * Created by me on 2016/1/8.
 */
$('#message-submit').click(function () {
    var content = $('#response-content').val();
    var div = $('<div></div>');
    div.addClass('alert alert-success text-right');
    div.attr('role', 'alert');
    div.html(content);
    var divf = $('<div class="col-lg-10 col-lg-offset-2"></div>');
    divf.append(div);
    var divff = $('<div class="row"></div>');
    divff.append(divf);

    var data = {
        toid: $('#kuang').attr('userid'),
        content: $('#response-content').val()
    };
    $.ajax({
        url: 'send_mess.do',
        type: 'POST',
        data: data,
        dataType: 'json',
        success: function (data) {
            console.log(data.remsg);
        }
    });

    $('#message-main').append(divff);
});

$('.msguser').click(function (e) {
    $('#kuang').html(e.target.innerHTML).attr("userid", e.target.attributes.userid.value);
});