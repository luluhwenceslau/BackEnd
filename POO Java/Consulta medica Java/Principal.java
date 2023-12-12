import pessoa.Medico;
import pessoa.Paciente;
import gerencial.Consulta;

public class Principal{

  public static void main (String[] args){

      Medico medico1 = new Medico();
      Paciente paciente1 = new Paciente();
      Medico medico2 = new Medico();
      Paciente paciente2 = new Paciente();
      Consulta consulta1 = new Consulta();
      Consulta consulta2 = new Consulta();

      
      medico1.setNome("Carlos");
      medico1.setEspecialidade("Gastrointestinal");
      medico1.setCpf("654847");
      medico1.setEndereco("Rua das flores");
      medico2.setNome("Marcos");
      medico2.setEspecialidade("Otorrinolaringologista");
      medico2.setEndereco("Rua das gracas");


      paciente1.setNome("Joao");
      consulta1.setIdade("25");
      paciente2.setNome("Julia");
      consulta2.setIdade("30");
      consulta1.setData("30/02/2012");
      consulta2.setData("30/02/2012");
      consulta1.setNomeMedico(medico1.getNome());
      consulta2.setNomeMedico(medico2.getNome());
      consulta1.setNomePaciente(paciente1.getNome());
      consulta2.setNomePaciente(paciente2.getNome());

      System.out.println();
      System.out.println("Consulta 1");
      System.out.println();
      System.out.println("Medico :" + medico1.getNome());
      System.out.println("Especialidade: " + medico1.getEspecialidade());
      System.out.println("Paciente: " + paciente1.getNome());
      System.out.println("Idade paciente: " + consulta1.getIdade());
      System.out.println("Data: " + consulta1.getData());
      
      System.out.println();
      System.out.println("Consulta 2");
      System.out.println();
      System.out.println("Medico :" + medico2.getNome());
      System.out.println("Especialidade: " + medico2.getEspecialidade());
      System.out.println("Paciente: " + paciente2.getNome());
      System.out.println("Idade paciente: " + consulta2.getIdade());
      System.out.println("Data: " + consulta2.getData());
  }

}