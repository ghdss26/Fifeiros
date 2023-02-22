<template>
 
 <div id="app">

<nav>
  <div class="nav-wrapper blue darken-1">
	<a href="#" class="brand-logo center">Fifeiros do Cordeiro</a>
  </div>
</nav>

<div class="container"> 

	<ul>
		<li v-for="(erro, index) of errors" :key="index"> 
			campo <b>{{ erro.jogos }}</b> - {{ erro.defaultMessage }}
		</li>
	</ul>

  <form @submit.prevent="salvar">

	<label>Nome</label>
	<input type="text" placeholder="Nome" v-model="usuario.nome">

	<label>Jogos</label>
	<input type="number" placeholder="Jogos" v-model="usuario.jogos">

	<label>Vitorias</label>
	<input type="number" placeholder="Vitorias" v-model="usuario.vitorias">

	<label>Empates</label>
	<input type="number" placeholder="Empates" v-model="usuario.empates"> 

	<label>Derrotas</label>
	<input type="number" placeholder="Derrotas" v-model="usuario.derrotas"> 

	<label>Gols_Pro</label>
	<input type="number" placeholder="Gols_Pro" v-model="usuario.gols_pro"> 

	<label>Gols_Contra</label>
	<input type="number" placeholder="Gols_Contra" v-model="usuario.gols_contra"> 

	<button class="waves-effect waves-light btn-small">Salvar<i class="material-icons left">save</i></button>

  </form>

  <table>

	<thead>

	<tr>
		<th>NOME</th>
		<th>JOGOS</th>
		<th>VITORIAS</th>
		<th>EMPATES</th>
		<th>DERROTAS</th> 
		<th>GOLS PRO</th>
		<th>GOLS CONTRA</th>
		<th>OPÇÕES</th>
	</tr>

	</thead>

	<tbody>

	<tr v-for="usuario of usuarios" :key="usuario.id">

		<td>{{ usuario.nome }}</td>
		<td>{{ usuario.jogos}}</td>
		<td>{{ usuario.vitorias}}</td>
		<td>{{ usuario.empates}}</td>
		<td>{{ usuario.derrotas}}</td>
		<td>{{ usuario.gols_pro}}</td>
		<td>{{ usuario.gols_contra}}</td>
		<td>
			<button @click="editar(usuario)" class="waves-effect btn-small blue darken-1"><i class="material-icons">create</i></button>
			<button  @click="remover(usuario)" class="waves-effect btn-small red darken-1"><i class="material-icons">delete_sweep</i></button>
		</td>

	</tr>

	</tbody>
  
  </table>

</div>

</div>

</template>

<script>

	import Usuario from './services/usuarios'

	export default { 

		data() {

			return {

				usuario: {

					id: '',
					nome: '', 
					jogos: '',
					vitorias: '', 
					empates: '', 
					derrotas: '', 
					gols_pro: '', 
					gols_contra: ''
				}, 

				usuarios: [],
				errors: []
			}
		},

		mounted() {

			this.listar()
		}, 

		methods: {

			listar() {

				Usuario.listar().then(resposta => {

					console.log(resposta.data)
					this.usuarios = resposta.data
				})
			},

			salvar() { 

				if(!this.usuario.id) {

					Usuario.salvar(this.usuario).then(() => {

					this.usuario = {}
					alert('Salvar com sucesso !') 
					this.listar()
					this.errors = []

					}).catch(e => {

					this.erros = e.response.data.errors
					})

				} else {

					Usuario.atualizar(this.usuario).then(() => {

					this.usuario = {}
					alert('Atualizado com sucesso !') 
					this.listar()
					this.errors = []

					}).catch(e => {
						
						this.erros = e.response.data.errors
					})
				}
			}, 

			editar(usuario) {

				this.usuario = usuario
			}, 

			remover(usuario) {

				if(confirm('Deseja excluir o usuario')) {

					Usuario.apagar(usuario).then(() => {

						this.listar(); 
						this.errors = []

					}).catch(e => {

						this.errors = e.response.data.errors
					})
				}
			}
		}
	}
</script>

<style>

</style>
