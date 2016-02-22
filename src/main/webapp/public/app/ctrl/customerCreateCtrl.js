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
            console.log(error);
            $scope.error = "Error: Customer not created.";
        });

    };

    // Cancels the creation / updating of a customer and sends the user to the view page.
    $scope.cancel = function() {

        $state.go("customer.view");

    };


}]);
