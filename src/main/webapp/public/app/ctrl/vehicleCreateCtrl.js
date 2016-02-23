angular.module("final-project").controller("vehicleCreateCtrl", ['$scope', '$state', '$q','vehicleService', 'makeService', 'modelService', 'makes', 'models',
    function($scope, $state, $q, vehicleService, makeService, modelService, makes, models) {

    // Initilization
    $scope.makes = makes;
    $scope.models = models;
    $scope.message = "";
    $scope.errors = [];
    $scope.newMake = {};
    $scope.newModel = {};

    var otherMake = ({makeName: "Other"});
    var otherModel = ({modelName: "Other"});

    // Creates a new vehicle
    $scope.createVehicle = function() {

        if ($scope.vehicleMake.makeName === "Other" && $scope.vehicleModel.modelName === "Other") {

            $q.all([makeService.newMake($scope.make), modelService.newModel($scope.model)]).then(function(response) {

                setMake(response[0].data);
                setModel(response[1].data);
                createVehicle();

            });

        }
        else if ($scope.vehicleMake.makeName === "Other") {

            $q.all([makeService.newMake($scope.make)]).then(function(response) {

                setMake(response[0].data);
                setModel($scope.vehicleMake);
                createVehicle();

            });

        }
        else if ($scope.vehicleModel.modelName === "Other") {

            $q.all([modelService.newModel($scope.model)]).then(function(response) {

                setMake($scope.vehicleModel);
                setModel(response[0].data);
                createVehicle();

            });

        }
        else {

            setMake($scope.vehicleModel);
            setModel($scope.vehicleMake);
            console.log($scope.newVehicle);
            createVehicle();

        }


    };

    // Cancels the creation / updating of a customer and sends the user to the view page.
    $scope.cancel = function() {

        $state.go("vehicle.view");

    };

    // Resets the values of a new make after creation and assigns the value to the new vehicle.
    function setMake(make) {

        $scope.newVehicle.make = make;
        $scope.makes.pop();
        $scope.makes.push(make);
        $scope.makes.push(otherMake);

    }

    // Resets the values of a new model after creation and assigns the value to the new vehicle.
    function setModel(model) {

        $scope.newVehicle.model = model;
        $scope.models.pop();
        $scope.models.push(model);
        $scope.models.push(otherModel);

    }

    // Creates a new vehicle in the database.
    function createVehicle() {

        vehicleService.create($scope.newVehicle).then(function() {

            $scope.message = "Vehicle added.";
            $scope.newVehicle = {};

        }, function(error) {

            $scope.errors.push("Error: Vehicle could not be created.");

        });

    }


}]);
