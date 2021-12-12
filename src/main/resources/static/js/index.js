
listarTransacoes();
listarClientes();

function dataFormatada(dataString) {
	
	const data = new Date(dataString);
        const dia  = data.getDate().toString();
        const diaF = (dia.length == 1) ? '0' + dia : dia;
        const mes  = (data.getMonth()+1).toString(); 
        const mesF = (mes.length == 1) ? '0' + mes : mes;
        const anoF = data.getFullYear();
        const hora = data.getHours();
		const minuto = data.getMinutes().toString(); 
        const minutoF = (minuto.length == 1) ? minuto +'0' : minuto; 
	return diaF + "/" + mesF + "/" + anoF + " " + hora + ":" + minutoF ;
}

function formataMoeda(valor){
	
	return valor.toLocaleString('pt-br',{style: 'currency', currency: 'BRL'});
}

async function listarClientes() {

	const url = window.location + "clientes/";
	const response = await request("GET", url);

	const clientes = JSON.parse(response);
	
	

	let table = document.getElementById('tabelaClientes');

	limparTabela(table);

	// Insere as linhas da tabela
	clientes.content.forEach(cliente => {
		let row = table.insertRow(1);
		row.innerHTML = `<td>Ag: ${cliente.conta.agencia}  Conta:${cliente.conta.numeroConta}</td>`
			+ `<td>${cliente.nome}</td>`
			+ `<td>${cliente.conta.tipoConta}</td>`
			+ `<td style="text-align: right;">${formataMoeda(cliente.conta.saldo)}</td>`;
	});
}

async function listarTransacoes() {

	const url = window.location + "transacoes";
	const response = await request("GET", url);

	const transacoes = JSON.parse(response);
	console.log(transacoes)

	let table = document.getElementById('tabelaTransacoes');

	limparTabela(table);

	// Insere as linhas da tabela
	transacoes.forEach(transacao => {
		let row = table.insertRow(1);
		row.innerHTML = `<td>${dataFormatada(transacao.data)}</td>`
			+ `<td>${transacao.nomeClienteOrigem}</td>`
			+ `<td>${transacao.tipoTransacao}</td>`
			+ `<td style="text-align: right;">${formataMoeda(transacao.valor)}</td>`;
	});
}

function request(method, url) {
	return new Promise(function(resolve, reject) {
		const xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function(e) {
			if (xhr.readyState === 4) {
				if (xhr.status === 200) {
					resolve(xhr.response)
				} else {
					reject(xhr.status)
				}
			}
		}
		xhr.ontimeout = function() {
			reject('timeout')
		}
		xhr.open(method, url, true)
		xhr.send()
	})
}

// Função utilizada para limpar as tabelas
function limparTabela (table) {    
    let rowCount = table.rows.length;
    for (let i = rowCount - 1; i > 0; i--) {
        table.deleteRow(i);
    }
}



const formCadastro = document.getElementById('formCadastro');

// Evento submit do form para cadastro do usuario
formCadastro.addEventListener('submit', (e) => {
	e.preventDefault();

	let usuario = JSON.stringify({
		nome: document.getElementById('name').value,
		email: document.getElementById('email').value
	});	

	let xhr = new XMLHttpRequest();
	xhr.withCredentials = false;

	xhr.addEventListener("readystatechange", function() {
		if (this.readyState === 4) {
			console.log(this.responseText);
		}
	});

	xhr.open("POST", "https://aj8guzvay0.execute-api.us-east-2.amazonaws.com/teste/emaillambda");
	xhr.setRequestHeader("Content-Type", "application/json");
	xhr.setRequestHeader("Access-Control-Allow-Origin", "*");

	xhr.send(usuario);
	
	// Limpa os campos
	document.getElementById('name').value = '';
	document.getElementById('email').value = '';


});

