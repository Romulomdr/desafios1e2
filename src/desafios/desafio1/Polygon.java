package desafios.desafio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Polygon {
	
    private int sidesNumber;
    private double sideSize;
    private String geometricName;
    private double area;
    List<Polygon> polygons = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public int getSidesNumber() {
		return sidesNumber;
	}

	public void setSidesNumber(int sidesNumber) {
		this.sidesNumber = sidesNumber;
	}

	public double getSideSize() {
		return sideSize;
	}

	public void setSideSize(double sideSize) {
		this.sideSize = sideSize;
	}

	public String getGeometricName() {
		return geometricName;
	}

	public void setGeometricName(String geometricName) {
		this.geometricName = geometricName;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Double areaCalculation(int sidesNumber, double sideSize) throws Exception {
		
		if(sidesNumber < 3) {
			throw new Exception("Sorry, The minimum number of sides in this polygon system is 3");
			
		}if(sidesNumber > 4) {
			throw new Exception("Sorry, The maximum number of sides in this polygon system is 4");
			
		}else {
			switch(sidesNumber) {
			
			case 3:
				this.area = ((sideSize*sideSize)*Math.sqrt(3))/4;
				this.geometricName = "▲ Triângulo";
				return this.area;
			
			case 4:
				this.area = sideSize*sideSize;
				this.geometricName = "■ Quadrado";
				return this.area;
			}
		}
		return null;
	}
	
	public void reportingPolygons() {
		boolean addMore = true;
		String response = "";
		int count = 1;
		
    	while (addMore) {
    		boolean stop = true;
    		
    		 try {
     	        System.out.println("Enter the number of sides for polygon " + count + ": ");
     	        int sides = sc.nextInt();
     	        System.out.println("Enter the size of the sides for polygon " + count + ": ");
     	        double size = sc.nextDouble();
     	        
     	        Polygon poligono = new Polygon();
     	        poligono.setSidesNumber(sides);
     	        poligono.setSideSize(size);
     	        try {
         	        poligono.areaCalculation(sides, size);
         	    } catch(Exception e) {
         	    	System.out.println(e.getMessage());
         	    	continue;
         	    }
     	        
     	        polygons.add(poligono);
     	        count++;
     	        
    	        while (stop) {
    	            System.out.println("Do you want to add another polygon? (yes/no): ");
    	            response = sc.next().toLowerCase();
    	            System.out.println(response);
    	            
    	            if (response.equals("yes")) {
    	            	stop = false;
    	            	
    	            }else if(response.equals("no")) {
    	            	addMore = false;
    	            	stop = false;
    	            }
    	            else {
    	                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
    	            }
    	        } 
     	    } catch (InputMismatchException e) {
     	        System.out.println("Invalid input. Please enter numerical values.");
     	        sc.next();
     	    }
     	}
	}
	
	public Double allAreaCalculation() {
		
		double result = 0.0;
		
		for(Polygon polygon : polygons) {
			result += polygon.getArea();
		}
		
		return result;
	}
	
	public void printPolygons() {
		for(Polygon polygon : polygons) {
			System.out.println(polygon.getGeometricName() + " de lado "+ polygon.getSideSize() +" cm e área "+ String.format("%.2f", polygon.getArea()) +" cm²");
		}
		double areas = allAreaCalculation();
		System.out.println("Área total: "+ String.format("%.2f", areas) + " cm²");
	}
}
