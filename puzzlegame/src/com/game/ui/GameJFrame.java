package com.game.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //游戏界面

    //创建二维数组
    //加载图片时会根据二维数组的数据加载
    int[][] data = new int[4][4];
    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;
    //定义变量记录当前图片路径
    String path = "puzzlegame\\image\\animal\\animal4\\";
    //定义一个二维数组存储正确数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    //定义变量记录步数
    int step = 0;

    //创建选项下的条目对象
    JMenu replaceItem = new JMenu("更换图片");

    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");

    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("联系方式");


    public GameJFrame() {
        //初始化界面
        initJFrame();


        //初始化菜单
        initJMenuBar();

        //初始化数据(打乱)
        initData();

        //初始化图片
        initImage();

        //让界面显示出来
        this.setVisible(true);
    }

    private void initData() {
        //定义一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱数组中顺序
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取随机索引
            int index = r.nextInt(tempArr.length);
            //遍历每个数据，与随机索引交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        //给二维数组添加数据
        //方案一
        /*for (int i = 0; i < tempArr.length; i++) {
            data[i/4][i%4]=tempArr[i];
        }*/
        //方案二
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                data[i][j] = tempArr[count];
                if (data[i][j] == 0) {
                    x = i;
                    y = j;
                }
                count++;
            }
        }

    }

    private void initImage() {
        //清空原来有的图片
        this.getContentPane().removeAll();
        //先加载的图片在上方

        if (victory()) {
            //显示胜利
            JLabel winJLabel = new JLabel(new ImageIcon("puzzlegame\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);

        }

        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        //外循环------列
        for (int i = 0; i < 4; i++) {
            //内循环-----行
            for (int j = 0; j < 4; j++) {
                //获取要加载图片的序号
                int num = data[i][j];
                //创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(0));
                //将管理容器添加到界面中
                this.getContentPane().add(jLabel);

            }
        }

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");


        //将选项条目添加到选项中
        functionJMenu.add(replaceItem);
        replaceItem.add(girlItem);
        replaceItem.add(animalItem);
        replaceItem.add(sportItem);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //将选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图单机版 v520.0");
        //界面置顶
        this.setAlwaysOnTop(true);
        //界面居中
        this.setLocationRelativeTo(null);
        //取消默认的居中放置
        this.setLayout(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //给整个界面添加界面监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松调用
    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();
        if (code == 65) {
            //删除界面所有图片
            this.getContentPane().removeAll();

            //加载完整图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(84, 134, 420, 420);
            this.getContentPane().add(all);
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面
            this.getContentPane().add(background);

            //刷新界面
            this.getContentPane().repaint();

        }

    }

    //松开按键调用
    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利
        if (victory()) {
            return;
        }
        //判断上下左右
        //左：37，上：38，右：39，下：40
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            //步数增加
            step++;

            //调用方法按最新的数字加载图片
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 0) {
                return;
            }
            //移动逻辑
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;

            //步数增加
            step++;

            //调用方法按最新的数字加载图片
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");

            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;

            //步数增加
            step++;

            //调用方法按最新的数字加载图片
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 3) {
                return;
            }

            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;

            //步数增加
            step++;

            //调用方法按最新的数字加载图片
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    //判断data[][]与win[][]是否相同，相同返回true
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }

            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被点击的条目对象
        Object obj = e.getSource();
        if (obj == replayItem) {
            System.out.println("重新游戏");

            //打乱数据
            initData();
            //计步器清零
            step = 0;
            //重新加载图片
            initImage();

        } else if (obj == reLoginItem) {
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeItem) {
            System.out.println("退出游戏");
            System.exit(0);
        } else if (obj == accountItem) {
            System.out.println("联系方式");
            //创建弹框对象
            JDialog jDialog = new JDialog();
            //创建图片管理容器的对象
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame\\image\\about1.jpg"));
            jLabel.setBounds(0, 0, 258, 258);
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344, 344);

            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);//设置不关闭次弹窗无法其他操作
            jDialog.setVisible(true);
        } else if (obj == girlItem) {
            Random r = new Random();
            int num = r.nextInt(13) + 1;
            path = "puzzlegame\\image\\girl\\girl" + num + "\\";
            //打乱数据
            initData();
            //计步器清零
            step = 0;
            //重新加载图片
            initImage();
        } else if (obj == animalItem) {
            Random r = new Random();
            int num = r.nextInt(8) + 1;
            path = "puzzlegame\\image\\animal\\animal" + num + "\\";
            //打乱数据
            initData();
            //计步器清零
            step = 0;
            //重新加载图片
            initImage();
        } else if (obj == sportItem) {
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            path = "puzzlegame\\image\\sport\\sport" + num + "\\";
            //打乱数据
            initData();
            //计步器清零
            step = 0;
            //重新加载图片
            initImage();
        }
    }
}
