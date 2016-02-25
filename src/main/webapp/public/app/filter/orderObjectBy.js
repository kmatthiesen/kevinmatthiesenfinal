// Obtained from stackoverflow at http://stackoverflow.com/questions/23920028/angularjs-orderby-on-ng-repeat-doesnt-work

angular.module('final-project').filter('orderObjectBy', function() {

    return function(items, field, reverse) {

        var filtered = [];
        
        angular.forEach(items, function(item) {

            filtered.push(item);

        });

        filtered.sort(function (a, b) {

            return (a[field] > b[field] ? 1 : -1);

        });

        if(reverse) filtered.reverse();

            return filtered;

        };
});
