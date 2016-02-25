angular.module('final-project').controller('passCreateCtrl', ['$scope', '$state', 'passService', 'getAllCustomers', 'getAllVehicles',
    function($scope, $state, passService, getAllCustomers, getAllVehicles){

    $scope.vehicles = getAllVehicles;
    $scope.customers = getAllCustomers;
    $scope.pass = {};
    $scope.pass.price = 24.99;
    $scope.pass.expirationDate = new Date();
    $scope.pass.expirationDate.setDate($scope.pass.expirationDate.getDate() + 30);

    $scope.createPass = function() {

        passService.create($scope.pass).then(function(){

            console.log("yay");

        }, function(error){

            console.log(error);

        });

    };

}]);
