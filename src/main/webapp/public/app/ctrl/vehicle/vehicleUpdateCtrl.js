angular.module("final-project").controller("vehicleUpdateCtrl", ['$scope', '$state', 'vehicleService', 'allVehicles', 'vehicle',
    function($scope, $state, vehicleService, allVehicles, vehicle) {

    // Initilization
    $scope.vehicles = allVehicles;
    $scope.vehicle = vehicle;
    $scope.message = "";
    $scope.error = "";
    // Adds a "vehicle" to the list to allow for new makes and models to be added.
    $scope.vehicles.push({make: "Other", model: "Other"});

    // Creates a new vehicle
    $scope.updateVehicle = function() {

        if ($scope.vehicle.make == "Other") {

            $scope.vehicle.make = $scope.newMake;

        }

        if ($scope.vehicle.model == "Other") {

            $scope.vehicle.model = $scope.newModel;

        }

        vehicleService.update($scope.vehicle).then(function() {

            $scope.message = "Vehicle updated.";
            $scope.error = "";

        }, function(error) {

            $scope.error = "Error: Vehicle could not be updated.";

        });



    };

    // Cancels the creation / updating of a customer and sends the user to the view page.
    $scope.cancel = function() {

        $state.go("vehicle.view", {}, {reload : true});

    };

}]);
