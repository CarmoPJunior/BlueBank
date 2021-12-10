
listarTransacoes();
listarClientes();

async function listarClientes() {

	const url = "http://localhost:8080/clientes/";
	const response = await request("GET", url);

	const clientes = JSON.parse(response);
	console.log(clientes.content)

	let table = document.getElementById('tabelaClientes');

	limparTabela(table);

	// Insere as linhas da tabela
	clientes.content.forEach(cliente => {
		let row = table.insertRow(1);
		row.innerHTML = `<td>Ag: ${cliente.conta.agencia}  Conta:${cliente.conta.numeroConta}</td>`
			+ `<td>${cliente.nome}</td>`
			+ `<td>${cliente.conta.tipoConta}</td>`
			+ `<td>${cliente.conta.saldo}</td>`;
	});
}

async function listarTransacoes() {

	const url = "http://localhost:8080/transacoes";
	const response = await request("GET", url);

	const transacoes = JSON.parse(response);
	console.log(transacoes)

	let table = document.getElementById('tabelaTransacoes');

	limparTabela(table);

	// Insere as linhas da tabela
	transacoes.forEach(transacao => {
		let row = table.insertRow(1);
		row.innerHTML = `<td>${transacao.data}</td>`
			+ `<td>${transacao.nomeClienteOrigem}</td>`
			+ `<td>${transacao.tipoTransacao}</td>`
			+ `<td>${transacao.valor}</td>`
			+ `<td>${transacao.descricao}</td>`;
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