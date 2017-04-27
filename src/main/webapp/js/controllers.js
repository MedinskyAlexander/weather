'use strict';

angular.module('WeatherViewer').controller('WeatherController', ['$scope', 'WeatherService', function ($scope, WeatherService) {

    $scope.cityInfo = {};
    $scope.showDetails = false;

    $scope.getWeather = function (city) {
        WeatherService.getWeather(city).then(function (data) {
            if (data) {
                $scope.cityInfo = data;
                $scope.showDetails = true;
            }
        });
//        todo: incorrect city name handling
    }

}]);