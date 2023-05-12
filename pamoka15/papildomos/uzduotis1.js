window.onload = function() {

    let x = prompt(`Įveskite pirmą žodį`)
    let y = prompt(`Įveskite pirmą žodį`)
    alert(`Žodžiai ${x} ir ${y} yra vienodo ilgio: ${arZodziaiVienodi(x, y)}`)
}

function arZodziaiVienodi(x, y) {
    return x.toLocaleLowerCase().length == y.toLocaleLowerCase().length;
}