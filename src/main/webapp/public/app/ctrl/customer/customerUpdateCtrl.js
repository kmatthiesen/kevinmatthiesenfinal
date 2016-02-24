angular.module("final-project").controller("customerUpdateCtrl", ['$scope', '$state', 'getCustomer', 'customerService',
    function($scope, $state, getCustomer, customerService) {

    // Initilization
    $scope.customer = getCustomer;
    $scope.message = "";
    $scope.error = "";

    // Updates a customers information.
    $scope.updateCustomer = function() {

        customerService.update($scope.customer).then(function(){
            $scope.message = "Customer Information Updated.";
        }, function(error) {
            console.log(error);
            $scope.error = "Error: Customer not updated.";
        });

    };

    // Cancels the creation / updating of a customer and sends the user to the view page.
    $scope.cancel = function() {

        $state.go("customer.view", {}, {reload : true});

    };


}]);
