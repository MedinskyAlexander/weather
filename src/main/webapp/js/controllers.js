'use strict';

angular.module('WeatherViewer').controller('WeatherController', ['$scope', 'WeatherService', function ($scope, WeatherService) {

    $scope.getWeather = function (city) {
        WeatherService.getWeather(city).then(function (data) {
        });
    }

}]);