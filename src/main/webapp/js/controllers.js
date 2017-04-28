'use strict';

angular.module('WeatherViewer').controller('WeatherController', ['$scope', 'WeatherService', function ($scope, WeatherService) {

    $scope.cities = [];
    $scope.cityInfo = {};
    $scope.showDetails = false;

    $scope.getWeather = function (city) {
        WeatherService.getWeather(city).then(function (data) {
            if (data) {
                $scope.cityInfo = {
                    current_observation: data.current_observation,
                    sun_phase: data.sun_phase
                };
                $scope.cities = data.response.results;
                if ($scope.cities) {
                    $scope.showDetails = $scope.cities.length == 0;
                    $scope.showCitiesSelection = $scope.cities.length > 0;
                } else {
                    $scope.showDetails = true;
                    $scope.showCitiesSelection = false;
                }
            }
        });
//        todo: incorrect city name handling
    };

    $scope.getWeatherByCountry = function (country, city) {
        $scope.cityName = country + '/' + city;
        WeatherService.getWeatherByCountry(country, city).then(function (data) {
            if (data) {
                $scope.cityInfo = {
                    current_observation: data.current_observation,
                    sun_phase: data.sun_phase
                };
                $scope.cities = data.response.results;
                if ($scope.cities) {
                    $scope.showDetails = $scope.cities.length == 0;
                    $scope.showCitiesSelection = $scope.cities.length > 0;
                } else {
                    $scope.showDetails = true;
                    $scope.showCitiesSelection = false;
                }
            }
        });
    };
}]);