angular.module("final-project").service("vehicleService", ["$http", function($http){

    // Gets a list of all current vehicle makes.
    function getMakes() {

        return $http.get("/vehicle/make");

    }

    // Gets a list of all current vehicle models.
    function getModels() {

        return $http.get("/vehicle/model");

    }

    // List of available functions.
    return {

        getMakes: getMakes,
        getModels: getModels

    };

}]);
