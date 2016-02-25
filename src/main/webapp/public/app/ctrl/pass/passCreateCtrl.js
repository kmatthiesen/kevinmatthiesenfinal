angular.module('final-project').controller('passCreateCtrl', ['$scope', '$state', 'passService', 'getAllCustomers', 'getAllVehicles',
    function($scope, $state, passService, getAllCustomers, getAllVehicles){

    $scope.vehicles = getAllVehicles;
    $scope.customers = getAllCustomers;
    templatePass();

    $scope.createPass = function() {

        passService.create($scope.pass).then(function(){

            $scope.message = "Pass successfully created.";
            templatePass();

        }, function(error){

            $scope.error = "Error: Pass not created.";
            console.log(error);

        });

    };

    function templatePass() {

        $scope.pass = {};
        $scope.pass.price = 24.99;
        $scope.pass.expirationDate = new Date();
        $scope.pass.expirationDate.setDate($scope.pass.expirationDate.getDate() + 30);

    }

}]);
