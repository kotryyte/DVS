/**
 * Created by Povilas on 4/3/2017.
 */
$(function() {
    /* Slider logic */
    var text = $('.like-feed-count').html();
    //Default FeedBack value */
    var dayFeedback = function(){var temp = []; myRoutes.controllers.FeedbackController.dayFeedback().ajax({success:function (data) {temp[0] = data.likesCount;temp[1] = data.dislikesCount;return temp;}, async: false}); return temp;};
    $('.like-feed-count').html(dayFeedback()[0] + " " + text );
    $('.dislike-feed-count').html(dayFeedback()[1] + " " + text);

    // Slider Logic //
    jQuery(document).ready(function ($) {
        var index = 1;
        $('#checkbox').change(function(){
            setInterval(function () {
                moveRight();
            }, 3000);
        });

        var slideCount = $('#slider ul li').length;
        var slideWidth = $('#slider ul li').width();
        var slideHeight = $('#slider ul li').height();
        var sliderUlWidth = slideCount * slideWidth;

        $('#slider').css({ width: slideWidth, height: slideHeight });

        $('#slider ul').css({ width: sliderUlWidth, marginLeft: - slideWidth });

        $('#slider ul li:last-child').prependTo('#slider ul');

        function moveLeft() {
            $('#slider ul').animate({
                left: + slideWidth
            }, 200, function () {
                $('#slider ul li:last-child').prependTo('#slider ul');
                $('#slider ul').css('left', '');
            });
        };

        function moveRight() {
            $('#slider ul').animate({
                left: - slideWidth
            }, 200, function () {
                $('#slider ul li:first-child').appendTo('#slider ul');
                $('#slider ul').css('left', '');
            });
        };

        $('a.control_prev').click(function () {
            moveLeft();
            index--;
            if(index == 0){
                index = 4
            }
            feedLogic(index);
        });

        $('a.control_next').click(function () {
            moveRight();
            index ++;
            if(index == 5){
                index = 1;
            }
            feedLogic(index);
        });

    });
/* -----------------------------------------------------  */
/* FeedBack logic */
function feedLogic(index){
    switch (index){
        /* Todays feedBack */
        case 1:
            var dayFeedback = function(){var temp = []; myRoutes.controllers.FeedbackController.dayFeedback().ajax({success:function (data) {temp[0] = data.likesCount;temp[1] = data.dislikesCount;return temp;}, async: false}); return temp;};
            /* Getting additional text add setting feedBack number */
            //var tempFeed =$('.like-feed-count').html();
            $('.like-feed-count').html(dayFeedback()[0] + " " + text );
            $('.dislike-feed-count').html(dayFeedback()[1] + " " + text);
            break;
        case 2:
            var weekFeedback = function(){var temp = []; myRoutes.controllers.FeedbackController.weekFeedback().ajax({success:function (data) {temp[0] = data.likesCount;temp[1] = data.dislikesCount;return temp;}, async: false}); return temp;};
            /* Getting additional text add setting feedBack number */
            //var tempFeed =$('.like-feed-count').html();
            $('.like-feed-count').html(weekFeedback()[0] + " " + text);
            $('.dislike-feed-count').html(weekFeedback()[1] + " " + text);
            break;
        case 3:
            var monthFeedback = function(){var temp = []; myRoutes.controllers.FeedbackController.monthFeedback().ajax({success:function (data) {temp[0] = data.likesCount;temp[1] = data.dislikesCount;return temp;}, async: false}); return temp;};
            /* Getting additional text add setting feedBack number */
            //var tempFeed =$('.like-feed-count').html();
            $('.like-feed-count').html(monthFeedback()[0] + " " + text);
            $('.dislike-feed-count').html(monthFeedback()[1] + " " + text);
            break;
        case 4:
            var totalFeedback = function(){var temp = []; myRoutes.controllers.FeedbackController.totalFeedback().ajax({success:function (data) {temp[0] = data.likesCount;temp[1] = data.dislikesCount;return temp;}, async: false}); return temp;};
            /* Getting additional text add setting feedBack number */
            //var tempFeed =$('.like-feed-count').html();
            $('.like-feed-count').html(totalFeedback()[0] + " " + text);
            $('.dislike-feed-count').html(totalFeedback()[1] + " " + text);
            break;
    }
}

});