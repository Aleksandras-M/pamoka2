window.onload = function() {

    let zodis = prompt(`Įveskite žodį`);
    let pradzia = prompt(`Įveskite ieškomą žodžio pradžią`);
    let pabaiga = prompt(`Įveskite ieškomą žodžio pabaigą`);
    alert(`Žodis ${zodis} prasideda ${pradzia} ir baigiasi ${pabaiga}: ${pradziaPabaigaVienodos(zodis, pradzia, pabaiga)}`);
}

function pradziaPabaigaVienodos(zodis, pradzia, pabaiga) {
    return zodis.toLocaleLowerCase().startsWith(pradzia.toLocaleLowerCase()) && zodis.toLocaleLowerCase().endsWith(pabaiga.toLocaleLowerCase());
}