angular.module("final-project").controller("customerCreateCtrl", ['$scope', '$state', 'customerService',
    function($scope, $state, customerService) {

    // Initilization
    $scope.message = "";
    $scope.error = "";

    // Creates a new customer
    $scope.createCustomer = function() {

        customerService.create($scope.newCustomer).then(function(){

            $scope.message = "Customer Added.";
            $scope.newCustomer = {};

        }, function(error) {

            $scope.error = "Error: Customer not created.";

        });

    };

}]);
