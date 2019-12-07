
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class RoadPoliceLoader {
    static public boolean save(RoadPolice rc,String file){
            
            try(FileWriter writer = new FileWriter(file, false))
            {
                for(car _car : rc.getCars()){               
                writer.write(_car.getAddress());
                writer.append('\n');
                writer.write(_car.getColor());
                writer.append('\n');
                writer.write(_car.getMark());
                writer.append('\n');
                writer.write(_car.getName());
                writer.append('\n');
                writer.write(_car.getNumber());
                writer.append('\n');
                writer.write(_car.getSurname());
                writer.append('\n');
                writer.write(_car.getYear());
                writer.append('\n');
                writer.flush();
                }
            }
            catch(IOException ex){
                return false;
            } 
            return true;
        };
    static public boolean save(RoadPolice rc){
            return save(rc, "File.txt");
        };
    static public boolean load(RoadPolice rc, String file){
            rc.Clear();
            try(FileReader reader = new FileReader(file))
            {
                Scanner scan = new Scanner(reader);
                while(scan.hasNextLine()){
                    car _car = new car();
                _car.setAddress(scan.nextLine());
                _car.setColor(scan.nextLine());
                _car.setMark(scan.nextLine());
                _car.setName(scan.nextLine());
                _car.setNumber(scan.nextLine());
                _car.setSurname(scan.nextLine());
                _car.setYear(java.lang.Integer.parseInt(scan.nextLine()));
                reader.close();
                }
            }
            catch(IOException ex){
                return false;
            } 
            return true;
        };
    static public boolean load(RoadPolice rc){
            return load(rc, "File.txt");
        };;
}
