angular.module("final-project").service("vehicleService", ["$http", function($http){

    var vehicleEndPoint = "/vehicle";

    function create(vehicle) {

        return $http.post(vehicleEndPoint, vehicle);

    }

    function getVehicles() {

        return $http.get(vehicleEndPoint);

    }

    function getVehicle(id) {

        return $http.get(vehicleEndPoint + '/' + id);

    }

    // List of available functions.
    return {

        create: create,
        getVehicles: getVehicles,
        getVehicle: getVehicle

    };

}]);
