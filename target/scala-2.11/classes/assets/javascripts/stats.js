/**
 * Created by Povilas on 3/6/2017.
 */
$(function(){
    //myRoutes.controllers.StatsController.totalCount().ajax({success:function (data) { parseTotalData(data)}})
    // Filling totalCount bar //
    var totalCount = function(){ var temp = null; myRoutes.controllers.StatsController.totalCount().ajax({success: function(data) { temp = data.total; return temp;}, async: false }); return temp; };
    var totalEstimation = function(){var temp = null; myRoutes.controllers.StatsController.totalStatsExpectation().ajax({success:function (data) {temp = data.value; return temp;}, async: false}); return temp;};

    var percentsTotal = (totalCount() * 100) / totalEstimation();
    $('.wrapper-animation').css('width', Math.round(percentsTotal) + '%');
    var tempTotal = $('.total').html();
    $('.total').html(totalCount() + "/"  + totalEstimation() + " " + tempTotal);

    /* Day stats */
    var dayCount = function(){ var temp = null; myRoutes.controllers.StatsController.dayStats().ajax({success: function(data) {
        temp = data.timesUsed; return temp;}, async: false }); return temp; };
    var dayEstimation = function(){var temp = null; myRoutes.controllers.StatsController.dayStatsExpectation().ajax({success:function (data) {
        temp = data.value; return temp;}, async: false}); return temp;};

    var percents = (dayCount() * 100) / dayEstimation();
     $('.today').css('width', Math.round(percents) + '%');
     $('.today-value').html("<h5>"+ dayCount() + "/" + dayEstimation() + "</h5>");

    /* Week stats */
    var weekCount = function(){ var temp = null; myRoutes.controllers.StatsController.weekStats().ajax({success: function(data) { temp = data.total; return temp;}, async: false }); return temp; };
    var weekEstimation = function(){var temp = null; myRoutes.controllers.StatsController.weekStatsExpectation().ajax({success:function (data) {temp = data.value; return temp;}, async: false}); return temp;};

    var weekPercents = (weekCount() * 100) / weekEstimation();
    $('.week').css('width',Math.round(weekPercents) + '%');
    $('.week-value').html("<h5>"+ weekCount() + "/" + weekEstimation() + "</h5>");

    /* Month stats */
    var monthCount = function(){ var temp = null; myRoutes.controllers.StatsController.monthStats().ajax({success: function(data) { temp = data.total; return temp;}, async: false }); return temp; };
    var monthEstimation = function(){var temp = null; myRoutes.controllers.StatsController.monthStatsExpectation().ajax({success:function (data) {temp = data.value; return temp;}, async: false}); return temp;};

    var monthPercents = (monthCount() * 100) / monthEstimation();
    $('.month').css('width',Math.round(monthPercents) + '%');
    $('.month-value').html("<h5>"+ monthCount() + "/" + monthEstimation() + "</h5>");

});