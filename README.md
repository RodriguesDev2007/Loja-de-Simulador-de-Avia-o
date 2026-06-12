# ✈️ AeroStock – Sistema Inteligente de Controle de Estoque para Simuladores de Aviação

## Visão Geral

O AeroStock é um sistema desenvolvido para auxiliar no gerenciamento de estoque de uma loja especializada em produtos voltados para simulação de voo. O objetivo é garantir maior controle sobre entradas, saídas e disponibilidade dos itens comercializados, permitindo um acompanhamento mais eficiente das movimentações realizadas.

O sistema foi projetado com foco em organização, rastreabilidade e qualidade de software, aplicando conceitos de Engenharia de Software, padrões de projeto, testes e documentação técnica.

---

# 🎯 Objetivos do Sistema

O sistema tem como finalidade:

* Controlar o cadastro de produtos da loja;
* Registrar entradas e saídas de mercadorias;
* Monitorar níveis de estoque;
* Manter histórico completo das movimentações;
* Gerar relatórios gerenciais;
* Controlar permissões de acesso dos usuários;
* Emitir alertas quando determinados produtos atingirem estoque crítico.

---

# 🛩️ Contexto de Aplicação

A loja trabalha com diversos equipamentos utilizados em simuladores de voo, como:

* Joysticks aeronáuticos;
* Pedais de leme;
* Manetes de potência;
* Painéis de instrumentos;
* Headsets aeronáuticos;
* Softwares de simulação;
* Kits completos de treinamento.

Como muitos desses produtos possuem alto valor agregado, torna-se essencial manter um controle rigoroso do estoque para evitar perdas e inconsistências.

---

# 🏗️ Arquitetura da Solução

A arquitetura foi estruturada utilizando princípios de orientação a objetos e padrões de projeto GoF, buscando:

* Baixo acoplamento;
* Alta coesão;
* Facilidade de manutenção;
* Reutilização de componentes;
* Escalabilidade futura.

A modelagem foi evoluída ao longo do projeto para suportar novas funcionalidades sem comprometer a estrutura principal do sistema.

---

# 🧩 Padrões de Projeto Aplicados

## Factory Method (Criacional)

Responsável pela criação dos diferentes tipos de produtos cadastrados no sistema.

### Benefícios

* Centraliza a criação dos objetos;
* Facilita a inclusão de novos produtos;
* Reduz dependências diretas.

---

## Proxy (Estrutural)

Aplicado ao controle de acesso das funcionalidades do sistema.

### Benefícios

* Restringe operações sensíveis;
* Garante maior segurança;
* Permite diferentes níveis de permissão.

---

## Observer (Comportamental)

Utilizado para monitorar alterações no estoque.

### Benefícios

* Notificações automáticas;
* Atualização em tempo real dos observadores;
* Facilidade para inclusão de novos mecanismos de alerta.

---

## Mediator (Comportamental)

Responsável por coordenar a comunicação entre os módulos do sistema.

### Benefícios

* Reduz comunicação direta entre classes;
* Facilita manutenção;
* Centraliza regras de interação.

---

## Visitor (Comportamental)

Utilizado para geração dos relatórios operacionais.

### Benefícios

* Permite adicionar novos relatórios sem alterar as classes existentes;
* Mantém a estrutura organizada;
* Facilita expansão futura.

---

# 📊 Funcionalidades Principais

## Cadastro de Produtos

Permite registrar novos produtos disponíveis para comercialização.

Informações registradas:

* Código;
* Nome;
* Categoria;
* Quantidade;
* Preço.

---

## Controle de Entradas

Toda mercadoria recebida é registrada no sistema.

O estoque é atualizado automaticamente após a confirmação da operação.

---

## Controle de Saídas

Toda venda ou retirada de produto gera uma movimentação de saída.

O sistema valida a disponibilidade antes de autorizar a operação.

---

## Histórico de Movimentações

Todas as operações ficam registradas para consulta futura.

Informações armazenadas:

* Data;
* Produto;
* Tipo da movimentação;
* Quantidade;
* Usuário responsável.

---

## Relatórios

O sistema disponibiliza relatórios para apoio à tomada de decisão.

Exemplos:

* Inventário geral;
* Movimentações realizadas;
* Produtos com estoque reduzido;
* Produtos mais movimentados.

---

# 🧪 Garantia da Qualidade

Para validação do sistema foram elaborados:

* Casos de teste funcionais;
* Testes de cenários alternativos;
* Testes de exceção;
* Testes unitários simulados utilizando JUnit.

O objetivo foi verificar a consistência das regras de negócio implementadas.

---

# 🔄 Controle de Versão

O desenvolvimento foi organizado utilizando Git e GitHub.

Estratégia adotada:

* Main → versão estável;
* Develop → integração das funcionalidades;
* Branches específicas para implementação dos padrões, testes e documentação.

Essa abordagem permitiu acompanhar a evolução incremental do projeto durante todas as etapas do desenvolvimento.

---

# 📚 Documentação Técnica

Todas as classes e métodos desenvolvidos foram documentados utilizando JavaDoc.

A documentação contempla:

* Descrição das classes;
* Descrição dos métodos;
* Parâmetros;
* Retornos;
* Observações técnicas.

---

# ✅ Critérios de Conclusão

Uma funcionalidade é considerada concluída quando:

* Possui modelagem atualizada;
* Possui testes correspondentes;
* Está documentada;
* Possui evidência de sua implementação na arquitetura do sistema.

---

# 🛠️ Tecnologias Utilizadas

* Java
* JUnit 5
* Git
* GitHub
* Draw.io
* UML
* JavaDoc

---

# 👨‍💻 Equipe do Projeto

Rafael Rodrigues da Silva Santos
