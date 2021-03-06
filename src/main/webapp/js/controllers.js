'use strict';

angular.module('WeatherViewer').controller('WeatherController', ['$scope', 'WeatherService', function ($scope, WeatherService) {

    $scope.cities = [];
    $scope.cityInfo = {};
    $scope.showDetails = false;
    $scope.showCitiesSelection = false;
    $scope.showErrorMsg = false;
    $scope.city = {
        name: '',
        byState: false
    };

    $scope.getWeather = function (city, country, state) {
        $scope.city.name = country == undefined ? '' : country + '/';
        $scope.city.name += state == undefined ? '' : state + '/';
        $scope.city.name += city == undefined ? '' : city;
        var url = 'weather/' + $scope.city.name;

        WeatherService.getWeather(url).then(function (data) {
            if (data) {
                $scope.cityInfo = {
                    current_observation: data.current_observation,
                    sun_phase: data.sun_phase
                };
                $scope.cities = data.response.results;
                $scope.error = data.response.error;

                if ($scope.error) {
                    $scope.showErrorMsg = true;
                    $scope.showDetails = false;
                    $scope.showCitiesSelection = false;
                } else {
                    $scope.showErrorMsg = false;
                    if ($scope.cities) {
                        $scope.showDetails = $scope.cities.length == 0;
                        $scope.showCitiesSelection = $scope.cities.length > 0;
                    } else {
                        $scope.showDetails = true;
                        $scope.showCitiesSelection = false;
                    }
                }
            }
        });
    };

    $scope.setByState = function (val) {
        $scope.city.byState = val;
    };
}]);