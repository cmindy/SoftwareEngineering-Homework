
public class ToDoList {
    final int MAX_STORAGE = 100;
    ToDoItem[] toDoStorage = new ToDoItem[MAX_STORAGE];
    int currentCount = 0;
    int selectToDoMenu = 0;

    static ToDoList toDoInstance = null;

    public static ToDoList createManagerInstance() {
        if(toDoInstance == null)
            toDoInstance = new ToDoList();
        return toDoInstance;
    }

    public ToDoList(){}

    public void selectToDoList() {
        do {
            System.out.println("==== TO-DO ====");
            System.out.println("1.Create 2.View 3.Update 4.Delete 5.MainMenu");
            System.out.print("선택 >> ");
            selectToDoMenu = MenuViewer.scan.nextInt();
            MenuViewer.scan.nextLine();

            switch (selectToDoMenu) {
                case INPUT_SELECT.CREATE:
                    createToDo();
                    break;
                case INPUT_SELECT.VIEW:
                    viewToDo();
                    break;
                case INPUT_SELECT.UPDATE:
                    updateToDo();
                    break;
                case INPUT_SELECT.DELETE:
                    deleteToDo();
                    break;
            }
        } while (selectToDoMenu != INPUT_SELECT.EXIT);
    }

    private ToDoItem readToDoInfo() {
        System.out.print("date:");
        String date=MenuViewer.scan.nextLine();
        System.out.print("due:");
        String due=MenuViewer.scan.nextLine();
        System.out.print("description:");
        String description=MenuViewer.scan.nextLine();
        return new ToDoItem(date,due,description);
    }

    private void createToDo() {
        ToDoItem info= readToDoInfo();
        toDoStorage[currentCount++]=info;
        System.out.println("데이터 입력이 완료되었습니다.");
    }

    public void viewToDo() {
        System.out.println("--------------To-Do List--------------");
        for(int index = 0; index< currentCount; index++) {
            System.out.print((index+1)+ " )");
            System.out.println(" date: "+toDoStorage[index].date +" | due: "+toDoStorage[index].due +" | description: "+toDoStorage[index].description );
        }
        System.out.println("--------------------------------------");
    }

    public void deleteToDo() {
        System.out.println("삭제할 인덱스를 선택해 주세요.");
        System.out.print("번호:");
        int selectIndex = MenuViewer.scan.nextInt();
        delete(selectIndex);
    }

    public void updateToDo() {
        System.out.println("수정할 인덱스를 선택해 주세요.");
        System.out.print("번호:");
        int selectIndex=MenuViewer.scan.nextInt();
        update(selectIndex);
    }

    public void delete(int selectIndex) {
        int check = checkList(selectIndex);
        if(check!=-1) {
            for(int index = (selectIndex-1); index<(currentCount -1); index++)
                toDoStorage[index]=toDoStorage[index+1];
            currentCount--;
            System.out.println("삭제 완료");
        }
    }

    private void update(int selectIndex) {
        int check = checkList(selectIndex);
        if(check!=-1) {
            System.out.println("수정할 내용을 입력해 주세요.");
            System.out.print("date:");
            toDoStorage[selectIndex-1].date =MenuViewer.scan.next();
            System.out.print("due:");
            toDoStorage[selectIndex-1].due=MenuViewer.scan.next();
            System.out.print("description:");
            toDoStorage[selectIndex-1].description=MenuViewer.scan.next();
            System.out.println("수정 완료");
        }
    }

    public int checkList(int selectIndex) {
        int check;
        if(currentCount ==0) {
            System.out.println("저장된 To-Do List가 없습니다.");
            check= -1;
        }
        else if((selectIndex> currentCount)||(selectIndex<0)) {
            System.out.println("선택한 인덱스에 해당하는 To-Do List가 없습니다.");
            check= -1;
        }
        else {
            check= 0;
        }
        return check;
    }
}