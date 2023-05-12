window.onload = function() {

    let x = prompt(`Įveskite pirmą žodį`);
    let y = prompt(`Įveskite antrą žodį`);
    alert(`${kurisZodisDidesnis(x, y)}`);

}

function kurisZodisDidesnis(x, y) {
    if (x > y) {
        return -1;        
    } else if (x == y){
        return 0;        
    } else {
        return 1;
    }
}