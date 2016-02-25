angular.module('final-project').controller('passUpdateCtrl', ['$scope', '$state', 'passService', 'getAllCustomers', 'getAllVehicles', 'getPass',
    function($scope, $state, passService, getAllCustomers, getAllVehicles, getPass){

    $scope.vehicles = getAllVehicles;
    $scope.customers = getAllCustomers;
    $scope.pass = getPass;

    $scope.updatePass = function() {

        passService.update($scope.pass).then(function(){

            console.log("yay");

        }, function(error){

            console.log(error);

        });

    };

    $scope.deletePass = function() {

        if (confirm("Are you sure you want to delete this pass?")) {

            passService.deletePass($scope.pass.passId).then(function(){

                alert("Parking Pass Deleted");
                $state.go("pass.view", {}, {reload: true});

            }, function(error) {

                console.log(error);

            });

        }



    };

}]);
