package io.altar.jseproject.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



//import io.altar.jseproject.repositories.ProductRepository;
//import io.altar.jseproject.repositories.ShelfRepository;
//import io.altar.jseproject.textinterface.Check;

public class Product extends Entity {
	
	//private int ID ; vai buscar o ID na class Entity, na qual o product herda da calss Entity
	
	private int descont;
	private int IVA;
	private int PVP;

												 //	Lista

	List<Shelf> list = new ArrayList <Shelf>();
	
	public void setList( List<Shelf> list){
		this.list = list;
	} 

	public void addList(Shelf S) {
		list.add(S);
	}
	
	public List<Shelf> getList(){
		return list;
	}
												//	Lista
	public void setDescont( int descont){
		this.descont = descont;
	}
	public int getDescont(){
		return descont;
	}
	public void setIVA( int IVA){
		this.IVA = IVA;
	}
	public int getIVA(){
		return IVA;
	}
	public  void setPVP(int PVP){
		this.PVP = PVP;
	}
	public  int getPVP(){
		return PVP;
	}
	public Product() {
	}	
	public Product( int descont, int iVA, int pVP) {
		
		this.descont = descont;
		this.IVA = iVA;
		this.PVP = pVP;
	}
	
	public String toString() {
		if(this.getList().isEmpty() == true) {
		return  "ID " + this.getID() +" Desconto: " + 	this.getDescont()  + " IVA :" + this.getIVA()  + " PVP : " + 
	this.getPVP() + " sem prateleira" ;
		}
		else {
			return  "ID " + this.getID() + " Desconto: " + 	this.getDescont()  + " IVA: " + this.getIVA()  + " PVP: " + 
					this.getPVP() + "  prateleira " + this.getList();
		}
	}

	public static Scanner input = new Scanner (System.in);
	
//	public static void createProduct() {
//		
//		String choice;
//		
//		System.out.println("novo produto");
//		Product x = new Product();	
//		
//		System.out.println("Insira o numero da lista");
//		ShelfRepository.getIntance().getEntity();				
//		choice = input.nextLine();
//		x.getList().add( (Shelf) ShelfRepository.getIntance().getEntity(Check.getChoiceLong(choice)));
//			
//		System.out.println("Insira o Desconto ");
//		choice = input.nextLine();
//		x.setDescont(Check.getChoiceInt(choice));
//	
//		System.out.println("Insira o IVA ");
//		choice = input.nextLine();
//		x.setIVA(Check.getChoiceInt(choice));
//
//	
//		System.out.println("Insira o PVP ");
//		choice = input.nextLine();	
//		x.setPVP(Check.getChoiceInt(choice));
//		//x.status();
//		//System.out.println(x);
////		if (x.getlist()!=null) {
////			x.getlist().setProductNameD(x); 
////		}
//		ProductRepository.getIntance().addEntity(x);
//		//productScreen();
//		
//	}
//	
//	public static void editProduct () {
//		ProductRepository.getIntance().getEntity();
//		System.out.println("Escolha o produto a Editar");
//
//		String editEnt = input.nextLine();
//
//		if(ProductRepository.getIntance().getEntity(Check.getChoiceLong(editEnt))!=null) {
//
//			Product r = (Product) ProductRepository.getIntance().getEntity(Check.getChoiceLong(editEnt));
//			
//			System.out.println("Escolher Prateleira");
//			editEnt = input.nextLine();
//		
//			if(!editEnt.equals("")) {
//				
////				if(r.getList().isEmpty()==true) {
////					System.out.println("Prateleira nao existe");
////				}
//				if(ShelfRepository.getIntance().getEntity(Check.getChoiceLong(editEnt))!= null) {
//				//r.getList().clear();
//				r.getList().add(((Shelf) ShelfRepository.getIntance().getEntity(Check.getChoiceLong(editEnt))));
//				((Shelf) ShelfRepository.getIntance().getEntity(Check.getChoiceLong(editEnt))).setProductNameD(r);
//				//r.setList((Shelf) ShelfRepository.getIntance().getEntity(Check.getChoiceLong(editEnt)));	
//				}
//			
//			}else {}
// 
//			System.out.println("Mudar Descont");
//			editEnt = input.nextLine();
//			if(!editEnt.equals("")) {
//				r.setDescont(Check.getChoiceInt(editEnt));
//			}else {}
//			
//			System.out.println("Mudar IVA");
//			editEnt = input.nextLine();
//			
//			if(!editEnt.equals("")) {
//				r.setIVA(Check.getChoiceInt(editEnt));
//			}else {}
//			
//
//			System.out.println("Mudar PVP");
//			editEnt = input.nextLine();
//				
//			if(!editEnt.equals("")) {
//				r.setPVP(Check.getChoiceInt(editEnt));
//			}else {}
//			
//
////			if(r.getList()!=null) {
////				r.getList().setProductNameD(r);
////			}
//			ProductRepository.getIntance().editEntity(r);
//			//ProductRepository.getIntance().getEntity();
//			//productScreen();
//			} else {
//				//productScreen();}			
//	}

	}

	



