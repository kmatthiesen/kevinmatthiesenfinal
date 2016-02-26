angular.module('final-project').controller('passUpdateCtrl', ['$scope', '$state', 'passService', 'getAllCustomers', 'getAllVehicles', 'getPass', 'getAllPasses',
    function($scope, $state, passService, getAllCustomers, getAllVehicles, getPass, getAllPasses){

    $scope.vehicles = getAllVehicles;
    $scope.customers = getAllCustomers;
    $scope.passes = getAllPasses;
    $scope.pass = getPass;

    $scope.updatePass = function() {

        passService.update($scope.pass).then(function(){

            $scope.message = "Pass successfully created.";
            $scope.error = "";

        }, function(error){

            $scope.error = "Error: Pass not updated.";
            $scope.message="";
            console.log(error);

        });

    };

    $scope.deletePass = function() {

        if (confirm("Are you sure you want to delete this pass?")) {

            passService.deletePass($scope.pass.passId).then(function(){

                alert("Parking Pass Deleted");
                $state.go("pass.view", {}, {reload: true});

            }, function(error) {

                $scope.error = "Error: Pass not deleted.";
                console.log(error);

            });

        }



    };

}]);
