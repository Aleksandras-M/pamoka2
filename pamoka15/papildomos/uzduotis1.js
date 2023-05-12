window.onload = function() {

    let x = prompt(`Įveskite pirmą žodį`);
    let y = prompt(`Įveskite antrą žodį`);
    alert(`Žodžiai ${x} ir ${y} yra vienodo ilgio: ${arZodziaiVienodi(x, y)}`);
}

function arZodziaiVienodi(x, y) {
    return x.toLocaleLowerCase().length == y.toLocaleLowerCase().length;
}