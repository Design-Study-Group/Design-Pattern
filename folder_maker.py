import os

# 기본 디렉토리 이름
base_dir = "title"
subfolders = ["이인규", "권우희", "이준환", "임소연"]
filename = ".remove"
file_content = "확인 후 삭제해주세요."

# title 폴더 만들기
os.makedirs(base_dir, exist_ok=True)

# 하위 폴더 및 파일 생성
for name in subfolders:
    folder_path = os.path.join(base_dir, name)
    os.makedirs(folder_path, exist_ok=True)

    file_path = os.path.join(folder_path, filename)
    with open(file_path, "w", encoding="utf-8") as f:
        f.write(file_content)

print("✅ 모든 폴더와 파일이 생성되었습니다.")
