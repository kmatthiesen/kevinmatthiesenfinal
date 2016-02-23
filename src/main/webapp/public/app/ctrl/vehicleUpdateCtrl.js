angular.module("final-project").controller("vehicleUpdateCtrl", ['$scope', '$state', 'vehicleService', 'makeService', 'modelService', 'makes', 'models', 'vehicle',
    function($scope, $state, vehicleService, makeService, modelService, makes, models, vehicle) {

    // Initilization
    $scope.makes = makes;
    $scope.models = models;
    $scope.vehicle = vehicle;
    $scope.message = "";
    $scope.errors = [];
    $scope.newMake = {};
    $scope.newModel = {};

    // Creates a new vehicle
    $scope.updateVehicle = function() {

        makeCheck();
        modelCheck();

        vehicleService.update($scope.vehicle).then(function() {

            $scope.message = "Vehicle added.";
            $scope.newCustomer = {};

        }, function(error) {

            $scope.errors.push("Error: Vehicle could not be created.");

        });



    };

    // Cancels the creation / updating of a customer and sends the user to the view page.
    $scope.cancel = function() {

        $state.go("vehicle.view");

    };

    // Checks to see if a new make is needed to be made and assigns the make to the new Vehicle
    function makeCheck() {

        if ($scope.vehicleMake.makeName === "Other") {

            return makeService.newMake($scope.make).then(function(response){

                $scope.vehicle.make = response.data;
                $scope.makes.pop();
                $scope.makes.push(response.data);
                $scope.makes.push({makeName: "Other"});
                return response.data;

            }, function(error){

                $scope.errors.push("Error: Unable to create new vehicle make.");
                return error;

            });
        }
        else {

            $scope.vehicle.make = $scope.vehicleMake;

        }

    }


    function modelCheck() {

        if ($scope.vehicleModel.modelName === "Other") {

            return modelService.newModel($scope.model).then(function(response){

                $scope.vehicle.model = response.data;
                $scope.models.pop();
                $scope.models.push(response.data);
                $scope.models.push({modelName: "Other"});
                return response.data;

            }, function(error){

                $scope.errors.push("Error: Unable to create new vehicle model.");
                return error;

            });
        }
        else {

            $scope.vehicle.model = $scope.vehicleModel;

        }

    }


}]);
