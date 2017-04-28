'use strict';

angular.module('WeatherViewer').factory('WeatherService', ['$http', '$q', function ($http, $q) {

    return {
        getWeather: getWeather
    };

    function getWeather(url) {
        var def = $q.defer();
        $http.get(url)
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