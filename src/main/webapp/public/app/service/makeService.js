angular.module("final-project").service("makeService", ["$http", function($http){

    var makeEndPoint = "/make";

    // Gets a list of all current vehicle makes.
    function getMakes() {

        return $http.get(makeEndPoint);

    }

    // Creates a new vehicle make.
    function newMake(make) {

        return $http.post(makeEndPoint, make);

    }

    // List of available functions.
    return {

        getMakes: getMakes,
        newMake: newMake

    };

}]);
