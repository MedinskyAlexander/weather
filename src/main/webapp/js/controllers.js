'use strict';

angular.module('WeatherViewer').controller('WeatherController', ['$scope', 'WeatherService', function ($scope, WeatherService) {

    $scope.cityInfo = {};
    $scope.showDetails = false;

    $scope.getWeather = function (city) {
        WeatherService.getWeather(city).then(function (data) {
            if (data) {
                $scope.cityInfo = data.current_observation;
                $scope.showDetails = true;
//                display_location.city
//                display_location.country
//                display_location.full!!!!
//                display_location.latitude
//                display_location.longitude
            }
        });
//        todo: incorrect city name handling
    }

}]);