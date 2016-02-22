angular.module("final-project").controller("vehicleCreateCtrl", ['$scope', '$state', 'vehicleService', 'makes', 'models',
    function($scope, $state, vehicleService, makes, models) {

    // Initilization
    $scope.makes = makes;
    $scope.models = models;
    $scope.message = "";
    $scope.error = "";

    // Creates a new customer
    $scope.createVehicle = function() {

        customerService.create($scope.newCustomer).then(function(){
            $scope.message = "Customer Added.";
            $scope.newCustomer = {};
        }, function(error) {
            console.log(error);
            $scope.error = "Error: Customer not created.";
        });

    };

    // Cancels the creation / updating of a customer and sends the user to the view page.
    $scope.cancel = function() {

        $state.go("customer.view");

    };


}]);
