# Linux Mint 17.1 Setup

## 安装

### 下载地址

- [Linux Mint 17.1 "Rebecca" - Cinnamon (64-bit)](http://www.linuxmint.com/edition.php?id=172)

### 安装

- [基于Ubuntu的Linux发行版安装方法](Install.md)

## 配置

**（安装有独立安装包的软件时，请优选择64位版本）**

0. 在 Software Sources 的 Office repositories 选项卡中，将全部软件源切换至国内服务器（推荐中国科技大学服务器USTC）
0. 使用 Update Manager 更新系统（选择并应用全部更新）
0. 在 Mouse & Touchpad 中，将鼠标和触摸板设置为最适合自己使用习惯的选项
0. 安装中文输入法

  ```
  sudo apt-get install ibus ibus-libpinyin
  ```
  注销当前用户并重新登录，在 Keyboard Input Methods 中添加 Intelligent Pinyin 输入法，并且在输入法设置中关闭 Correct pinyin 功能。
0. 安装[Chrome浏览器](https://www.google.com/intl/en/chrome/browser/?platform=linux)
0. 安装[XMind](http://www.xmind.net/download/linux/)
0. 安装 build-essential

  ```
  sudo apt-get install build-essential
  ```
0. 安装Skype

  ```
  sudo apt-get install skype
  ```
0. 安装[uGet](http://ugetdm.com)

  ```
  sudo apt-get install aria2 uget
  ```
  安装完成以后请在设置选项中的Plugin面板开启```aria2```支持，这样能够在以后下载时使用多点下载功能。
0. 安装[SMPlayer](http://smplayer.sourceforge.net)

  ```
  sudo add-apt-repository ppa:rvm/smplayer 
  sudo apt-get update 
  sudo apt-get install smplayer smtube smplayer-themes smplayer-skins 
  ```
0. 添加所需要使用的工具的第三方PPA源

  ```
  sudo add-apt-repository ppa:git-core/ppa
  sudo add-apt-repository ppa:webupd8team/atom
  sudo add-apt-repository ppa:webupd8team/java
  sudo add-apt-repository ppa:jerzy-kozera/zeal-ppa
  ```
0. 更新软件包数据并安装所需要使用的工具（cURL、Git、Atom、[Zeal](http://zealdocs.org)、Oracle JDK 8）

  ```
  sudo apt-get update
  sudo apt-get install curl git atom zeal oracle-java8-installer
  ```
0. 安装Atom编辑器的扩展包

  ```
  apm install linter linter-jshint editorconfig atom-beautify
  ```
0. 安装 [IntelliJ IDEA Ultimate Edition](https://www.jetbrains.com/idea/download/) 编辑器
0. 安装 IntelliJ IDEA Ultimate Edition 编辑器插件
  - .gitignore support
  - NodeJS
  - AngularJS
  - Karma
