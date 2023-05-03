window.onload = function() {
    
    let x = -47

    let y = 25 + x
    console.log("Kai x yra " + x + " o y yra " + y) 
    console.log("suma yra " + (x + y))
    console.log("suma yra " + suma(x, y))
}

function suma(a, b) {
    return a + b
}