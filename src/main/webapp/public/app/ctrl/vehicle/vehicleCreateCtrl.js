angular.module("final-project").controller("vehicleCreateCtrl", ['$scope', '$state', 'vehicleService', 'allVehicles',
    function($scope, $state, vehicleService, allVehicles) {

    // Initilization
    $scope.vehicles = allVehicles;
    $scope.message = "";
    $scope.error = "";
    // Adds a "vehicle" to the list to allow for new makes and models to be added.
    $scope.vehicles.push({make: "Other", model: "Other"});

    // Creates a new vehicle
    $scope.createVehicle = function() {

        if ($scope.newVehicle.make == "Other") {

            $scope.newVehicle.make = $scope.newMake;

        }

        if ($scope.newVehicle.model == "Other") {

            $scope.newVehicle.model = $scope.newModel;

        }

        vehicleService.create($scope.newVehicle).then(function() {

            $scope.message = "Vehicle added.";
            $scope.newVehicle = {};
            $scope.error = "";

        }, function(error) {

            $scope.error = "Error: Vehicle could not be created.";

        });


    };

}]);
