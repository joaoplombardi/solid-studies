package br.com.alura.rh.model;

public enum JobRole {

	ASSISTENTE{
		@Override
		public JobRole getNextJob() {
			return ANALISTA;
		}
	},
	ANALISTA{
		@Override
		public JobRole getNextJob() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA{
		@Override
		public JobRole getNextJob() {
			return GERENTE;
		}
	},
	GERENTE{
		@Override
		public JobRole getNextJob() {
			return null;
		}
	};

	public abstract JobRole getNextJob();
}
