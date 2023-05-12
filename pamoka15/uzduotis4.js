window.onload = function() {

    let z = prompt("Įveskite žodį");
    console.log(`Žodis ${z} turi savyje žodį taip : ${z.toLocaleLowerCase().includes("taip")}`);
    
}

