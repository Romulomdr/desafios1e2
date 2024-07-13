# ✔ Desafio 1 e 2

# 🧮 Calculadora de Polígonos
- Bem-vindo à Calculadora de Polígonos! Este projeto permite aos usuários inserir vários polígonos, calcular suas áreas e exibir suas propriedades. O aplicativo suporta polígonos com 3 a 4 lados (triângulos e quadrados), mas é expansível caso desejar, este desafio foi feito visando aproveitar 100% dos aspectos informados via e-mail, desde já agradeço a atenção de todos.

## 🚀 Features

- Adicionar Vários Polígonos
- Calcular a área de cada polígono
- Exibir os detalhes de todos os polígonos adicionados na ordem em que foi adicionado.
- Somar todas as áreas.
  
## 📋 Diagrama de Classe
- Abaixo segue como foi construída a classe "Polygon" visando salvar todos os dados informados pelo usuário para os futuros cálculos.

![Poligono drawio](https://github.com/user-attachments/assets/8fc01d97-d51f-4ff6-af3e-f34e6c8e2992)

## 🚦 Fluxograma

<img width="2602" alt="Desafio1-Polygon" src="https://github.com/user-attachments/assets/68f34526-ef4d-47b2-a5cd-53565b0f1261">


# 📑 Relatório RH
- Todo o processo deste desafio foi feito usando PostgreSQL localmente, e as queries foram feitas usando o query tools do pgAdmin4.

# 📈 Roadmap

- 1º Criando a tabela "employee" com id, nome e e-mail, onde cada e-mail será unico para não duplicar usuários e o id será auto-incrementado (criando-tabela-empregado.sql).
- 2º Inserir empregados manualmente para povoar a tabela (inserindo-empregados.sql).
- 3º Criando a tabela "salary" com os campos id, valor recebido, data de pagamento e id do empregado que vai receber (criando-tabela-salario.sql).
- 4º Inserir salários na tabela "salary" passando o valor recebido, data e o id do empregado que recebeu (inserindo-salario-empregado.sql).
- 5º Criar consulta para gerar a média individual de cada funcionário (media-salarial-individual.sql).
- 6º Criar uma consulta para pegar da data atual e subtrair 3 meses, e ainda nessa consultar calcular as 3 maiores médias de pagamentos dos empregados desses ultimos 3 meses (media-salario-ultimos-meses.sql).

# ⚙ Resultado

- Abaixo segue algumas fotos que comprovam o sucesso das consultas requeridas, e nos arquivos do repositório possuem os CSV's dos relatórios:
  
- Salário individual (ordenado de forma crescente por id):
  
![media-salario-individual](https://github.com/user-attachments/assets/65114a0d-2d79-46ac-826d-2806b42f7746)

- Top 3 maiores salários dos últimos 3 meses:
  
![media-salario-ultimos-meses](https://github.com/user-attachments/assets/24b03eec-650c-4090-9fee-a7bbe32fcc07)


## ✒️ Autor

* [**Romulo Matheus**](https://github.com/Romulomdr) - *At the moment developer Java back-end and support in Moodle environments* [<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" />](https://www.linkedin.com/in/romulo-dantasmdr/)
