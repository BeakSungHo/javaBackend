package fileCreate;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class createFile {

    private static Scanner sc;
    private static String file_name;
    private static int MAX= 1;
    //해당 경로에 넣어야함 D:\정보치리기사 학원 (미라클 코리안 it)
    private static String default_Path="D:\\ncs(미라클코리안it)\\";

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        System.out.println("오늘의 날짜를 입력해주세요");
        file_name = sc.next();

        String path=default_Path+file_name;
        Path directoryPath = Paths.get(path);
        try {
            // 디렉토리 생성
            Files.createDirectory(directoryPath);

            System.out.println(directoryPath + " 디렉토리가 생성되었습니다.");

            FileCreate(path,file_name);//파일생성 함수

        } catch (FileAlreadyExistsException e) {
            System.out.println("디렉토리가 이미 존재합니다");
        } catch (NoSuchFileException e) {
            System.out.println("디렉토리 경로가 존재하지 않습니다 usb를 꼳아주세요 ");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    //https://mimah.tistory.com/38

    public static boolean CrateNewFile_T_F(File[] files) throws IOException {
        for(int i =0;i<MAX;i++) {
            if(files[i].createNewFile());
            else {
                return false;
            }
        }
        return true;
    }

    public static boolean Exists_T_F(File[] files) throws IOException {
        for(int i =0;i<MAX;i++) {
            if(files[i].exists());
            else {
                return true;
            }
        }
        return false;
    }

    public static void FileCreate(String Path,String file_name) throws IOException {
        File Default = new File(Path);
        File[] files = new File[MAX];
        if(MAX ==1){
            files[0]= new File(Default, file_name+".txt");

        }else {
            for(int i = 0;i<files.length;i++) {
                files[i]= new File(Default, file_name+" "+(i+1)+"번째 타임.txt");
                System.out.println(files[i].getAbsolutePath());
            }
        }
//		System.out.println(f1.getAbsolutePath());

        if (Exists_T_F(files)) {	// 파일이 존재하지 않으면 생성
            try {
                if (CrateNewFile_T_F(files))
                    System.out.println("모든 파일 생성 성공");
                else
                    System.out.println("모든 파일 생성 실패");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {	// 파일이 존재한다면
            System.out.println("파일이 이미 존재합니다.");
        }
        System.out.println();
    }

}
