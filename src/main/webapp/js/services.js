'use strict';

angular.module('WeatherViewer').factory('WeatherService', ['$http', '$q', function ($http, $q) {

    return {
        getWeather: getWeather
    };

    function getWeather(city) {
        var def = $q.defer();
        $http.get('weather/' + city)
            .success(function (data) {
                console.log(data);
                def.resolve(data);
            })
            .error(function (response) {
                def.reject(response);
            });
        return def.promise;
    }

}]);